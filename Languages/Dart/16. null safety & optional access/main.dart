int lengthOrZero(String? name) => name?.length ?? 0;
void main() {
  print(lengthOrZero(null));
  print(lengthOrZero('Mina'));
}
