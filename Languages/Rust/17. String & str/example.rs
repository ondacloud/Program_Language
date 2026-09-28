fn main() {
    let text = String::from("가A");
    println!("{} {}", text.len(), text.chars().count());
    println!("{}", &text[..3]);
    let numbers = [10, 20, 30];
    println!("{:?}", &numbers[1..]);
}
