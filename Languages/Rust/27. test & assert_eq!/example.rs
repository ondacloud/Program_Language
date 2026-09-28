fn average(values: &[f64]) -> Option<f64> {
    if values.is_empty() { None } else { Some(values.iter().sum::<f64>() / values.len() as f64) }
}
fn main() { println!("{:?}", average(&[2.0, 4.0])); }
#[cfg(test)]
mod tests {
    use super::average;
    #[test] fn empty() { assert_eq!(average(&[]), None); }
    #[test] fn ordinary() { assert_eq!(average(&[2.0, 4.0]), Some(3.0)); }
}
