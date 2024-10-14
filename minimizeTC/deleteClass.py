import os
import re

def read_java_file(file_path):
    """Read the content of a Java file."""
    with open(file_path, 'r') as file:
        return file.read()

def extract_test_methods(java_code):
    """Extract test methods from the Java code."""
    pattern = re.compile(r'@Test\s+public void (\w+)\(\) throws Throwable \{([^}]*)\}')
    return pattern.findall(java_code)

def filter_methods_not_using_service(test_methods, service_class_name):
    """Filter out methods that do not use the specified service class."""
    filtered_methods = []
    for method_name, method_body in test_methods:
        if service_class_name in method_body:
            filtered_methods.append((method_name, method_body))
    return filtered_methods

def write_filtered_java_file(original_code, filtered_methods, output_file_path):
    """Write the filtered methods to a new Java file."""
    header = re.search(r'(.*?)(@Test\s+public void \w+\(\) throws Throwable \{)', original_code, re.DOTALL).group(1)
    with open(output_file_path, 'w') as file:
        file.write(header)
        for method_name, method_body in filtered_methods:
            method_code = f'\n    @Test\n    public void {method_name}() throws Throwable {{{method_body}}}\n    }}\n'
            file.write(method_code)
        file.write('}\n')  # Closing bracket for the class

def main(input_file, output_file, service_class_name):
    java_code = read_java_file(input_file)
    test_methods = extract_test_methods(java_code)
    filtered_methods = filter_methods_not_using_service(test_methods, service_class_name)
    write_filtered_java_file(java_code, filtered_methods, output_file)

if __name__ == "__main__":
    input_file = 'RegressionTest0.java'  # Input file path
    output_file = 'FilteredRegressionTest0.java'  # Output file path
    service_class_name = 'UserService'  # The service class name to check for
    main(input_file, output_file, service_class_name)
