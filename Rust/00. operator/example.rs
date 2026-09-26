fn main() {
    let mut n = 7;
    println!("{} {} {} {} {}", n+2, n-2, n*2, n/2, n%2);
    n += 3;
    println!("{n} {}", 7.0_f64 / 2.0);
    println!("{} {} {}", n == 10, n != 10, n >= 0 && n < 20);
    println!("{} {}", !(n < 0), n < 0 || n == 10);
    println!("{}", 2 + 3 * 4);
}
