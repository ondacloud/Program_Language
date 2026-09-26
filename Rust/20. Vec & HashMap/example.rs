use std::collections::HashMap;
fn main() {
    let mut values = vec![3, 1];
    values.push(2); values.sort();
    let mut counts = HashMap::new();
    for word in ["a", "b", "a"] { *counts.entry(word).or_insert(0) += 1; }
    println!("{values:?}");
    println!("{}", counts["a"]);
}
