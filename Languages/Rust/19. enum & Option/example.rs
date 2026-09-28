enum Action { Add(i32), Reset }
fn apply(value: i32, action: Action) -> i32 {
    match action { Action::Add(n) => value + n, Action::Reset => 0 }
}
fn main() {
    println!("{} {}", apply(2, Action::Add(3)), apply(2, Action::Reset));
    let values = [10];
    match values.get(1) { Some(n) => println!("{n}"), None => println!("missing") }
}
