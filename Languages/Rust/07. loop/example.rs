fn main() {
let mut n = 0;
let result = loop {
    n += 1;
    if n == 3 { break n * 2; }
};
println!("{result}");
}
