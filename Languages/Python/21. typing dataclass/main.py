from dataclasses import dataclass, field

@dataclass
class User:
    name: str
    tags: list[str] = field(default_factory=list)

def greet(user: User) -> str:
    return f"Hello {user.name}"

first = User("Alice")
second = User("Bob")
first.tags.append("admin")
print(greet(first))
print(second.tags)
