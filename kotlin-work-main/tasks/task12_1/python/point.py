# Task 12.1: Point class
## name: Le Tang
## Student ID: 201912989(Leeds)//SWJTU:2024117002

from math import hypot

class Point:
    def __init__(self, x: float, y: float):
        self.x=x
        self.y=y

    def distance(self) -> float:
        return hypot(self.x, self.y)

    def distance_to(self, p: 'Point') -> float:
        return hypot(self.x - p.x, self.y - p.y)