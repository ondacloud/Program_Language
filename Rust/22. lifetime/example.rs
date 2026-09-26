fn longer<'a>(a: &'a str, b: &'a str) -> &'a str {
    if a.len() >= b.len() { a } else { b }
}
fn main() {
    let first = String::from("Rust");
    let second = String::from("Go");
    println!("{}", longer(&first, &second));
}
