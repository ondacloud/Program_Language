fn square(n: i32) -> i32 { n * n }
fn main() {
    let value = { let x = 3; square(x) };
    println!("{value}");
}
