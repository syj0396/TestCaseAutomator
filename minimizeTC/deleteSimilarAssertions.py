import re

def read_java_file(file_path):
    with open(file_path, 'r', encoding='utf-8') as file:
        return file.read()

def extract_test_methods(java_code):
    pattern = re.compile(r'(@Test\s+public void (\w+)\(\) throws Throwable \{[^}]+\})', re.DOTALL)
    return pattern.findall(java_code)

def extract_method_calls_and_assertions(function_code):
    methods_pattern = re.compile(r'\b(editUser|getUser|saveUser)\(')
    assertion_pattern = re.compile(r'org\.junit\.Assert\.(\w+)\(')
    method_calls = set(methods_pattern.findall(function_code))
    assertions = set(assertion_pattern.findall(function_code))
    return method_calls, assertions

def main(input_file, output_file):
    java_code = read_java_file(input_file)
    test_methods = extract_test_methods(java_code)
    
    unique_tests = []
    seen = set()

    for full_code, name in test_methods:
        method_calls, assertions = extract_method_calls_and_assertions(full_code)
        key = (frozenset(method_calls), frozenset(assertions))
        
        if key not in seen:
            seen.add(key)
            unique_tests.append(full_code)

    filtered_code = '\n\n'.join(unique_tests)
    
    with open(output_file, 'w', encoding='utf-8') as file:
        file.write(filtered_code)

if __name__ == "__main__":
    input_file = 'newTest.java'
    output_file = 'newTest2.java'
    main(input_file, output_file)
