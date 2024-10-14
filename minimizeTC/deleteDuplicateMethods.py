import os
import re

def read_java_file(file_path):
    with open(file_path, 'r', encoding='utf-8') as file:
        return file.read()

def extract_test_methods(java_code):
    pattern = re.compile(r'(@Test\s+public void \w+\(\) throws Throwable \{[^}]+\})', re.DOTALL)
    return pattern.findall(java_code)

def should_remove_function(function_code):
    methods = ['editUser', 'getUser', 'saveUser']
    method_calls = {method: re.findall(rf'\b{method}\(', function_code) for method in methods}
    method_counts = {method: len(calls) for method, calls in method_calls.items()}
    multiple_calls = [method for method, count in method_counts.items() if count > 1]
    has_other_calls = any(method_counts[method] > 0 for method in methods if method not in multiple_calls)
    return bool(multiple_calls) and not has_other_calls

def main(input_file, output_file):
    java_code = read_java_file(input_file)
    test_methods = extract_test_methods(java_code)
    filtered_methods = [func for func in test_methods if not should_remove_function(func)]

    filtered_code = '\n'.join(filtered_methods)
    
    with open(output_file, 'w', encoding='utf-8') as file:
        file.write(filtered_code)

if __name__ == "__main__":
    input_file = 'filteredRegressionTest0.java'
    output_file = 'newTest.java'
    main(input_file, output_file)
