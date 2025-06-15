# Flowchart converted to Python code

def flowchart_logic():
    # Initialize variables
    a = 3
    b = 5
    
    print(f"Initial values: a = {a}, b = {b}")
    
    # Main loop
    while True:
        print(f"\nChecking condition: a < b && b > 4")
        print(f"Current values: a = {a}, b = {b}")
        
        # Check if a < b AND b > 4
        if a < b and b > 4:
            print("Condition is True - taking Yes path")
            
            # Execute b = b + 1
            b = b + 1
            print(f"After b = b + 1: a = {a}, b = {b}")
            
            # Check if a == 3
            print(f"Checking if a == 3: {a} == 3?")
            if a == 3:
                print("a == 3 is True - taking Yes path")
                
                # Execute a = a + 2 and b = b + 5
                a = a + 2
                b = b + 5
                print(f"After a = a + 2, b = b + 5: a = {a}, b = {b}")
                
                # Check if a > 8
                print(f"Checking if a > 8: {a} > 8?")
                if a > 8:
                    print("a > 8 is True - exiting loop")
                    break
                else:
                    print("a > 8 is False - continuing loop")
                    continue
            else:
                print("a == 3 is False - going to print")
                break
        else:
            print("Condition is False - exiting")
            break
    
    # Print final result
    result = a + b
    print(f"\nFinal calculation: a + b = {a} + {b} = {result}")
    return result

# Run the flowchart logic
if __name__ == "__main__":
    output = flowchart_logic()
    print(f"\nFinal Output: {output}")