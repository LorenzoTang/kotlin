# Task 12.1: program that uses a Point object
## name: Le Tang
## Student ID: 201912989(Leeds)//SWJTU:2024117002
# Remember that you'll need an import statement to access the class!


from point import Point

def main():
    point = Point(3.0, 4.0)
    print(f"x = {point.x}")
    print(f"y = {point.y}")
    print(f"Distance form origin = {point.distance()}")


    p2 = Point(4.5, 7.0)
    print(f"Distance to p2 = "
          f"{point.distance_to(p2)}")

if __name__ == "__main__":
    main()
