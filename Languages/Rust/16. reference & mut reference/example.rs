fn append(value: &mut String) { value.push('!'); }
fn main() {
    let mut text = String::from("hi");
    let size = text.len();
    append(&mut text);
    println!("{size} {text}");
}
