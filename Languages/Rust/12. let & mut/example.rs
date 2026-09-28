fn main() {
    let mut count: i32 = 2;
    count += 1;
    let count = count.to_string();
    let pair: (bool, usize) = (true, count.len());
    println!("{} {} {}", count, pair.0, pair.1);
}
