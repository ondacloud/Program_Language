fn main() {
    let first = String::from("rust");
    let second = first;
    let third = second.clone();
    println!("{second} {third}");
    let a = 7;
    let b = a;
    println!("{a} {b}");
}
