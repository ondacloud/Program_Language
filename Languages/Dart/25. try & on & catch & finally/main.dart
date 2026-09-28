void main() {
  try {
    int.parse('wrong');
  } on FormatException {
    print('invalid number');
  } finally {
    print('done');
  }
}
