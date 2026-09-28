fn main() {
    let count: u8 = 255;
    let price: f64 = 2.5;
    let letter: char = '가';
    println!("{count} {price} {} {letter}", true);
    println!("{}", i32::from(count));
    println!("{}", u8::try_from(300).is_err());
    println!("{}", "12".parse::<i32>().unwrap_or(0));
}
