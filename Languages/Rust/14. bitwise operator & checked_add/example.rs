fn main() {
    let a: u8 = 5;
    let b: u8 = 3;
    println!("{} {} {} {}", a & b, a | b, a ^ b, !a);
    println!("{} {}", a << 1, a >> 1);
    println!("{:?}", 255_u8.checked_add(1));
    println!("{} {}", 255_u8.saturating_add(1), 255_u8.wrapping_add(1));
}
