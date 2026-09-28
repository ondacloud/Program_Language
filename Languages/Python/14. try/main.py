def divide_text(text):
    try:
        value = int(text)
        result = 10 / value
    except ValueError:
        return "invalid integer"
    except ZeroDivisionError:
        return "zero is not allowed"
    else:
        return result

print(divide_text("2"))
print(divide_text("0"))
print(divide_text("abc"))
