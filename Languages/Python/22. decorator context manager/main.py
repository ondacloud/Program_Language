from functools import wraps
from contextlib import contextmanager

def traced(function):
    @wraps(function)
    def wrapper(*args, **kwargs):
        print("call", function.__name__)
        return function(*args, **kwargs)
    return wrapper

@contextmanager
def session():
    print("open")
    try:
        yield
    finally:
        print("close")

@traced
def add(a, b):
    return a + b

with session():
    print(add(2, 3))
