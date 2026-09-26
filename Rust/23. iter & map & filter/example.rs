fn main() {
    let values = vec![1, 2, 3, 4];
    let limit = 2;
    let doubled: Vec<_> = values.iter().copied().filter(|n| *n > limit).map(|n| n * 2).collect();
    println!("{doubled:?}");
    println!("{}", values.len());
}
