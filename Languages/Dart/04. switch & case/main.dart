void main() {
  final command = 'save';
  switch (command) {
    case 'save':
      print('saved');
    case 'load':
      print('loaded');
    default:
      print('unknown');
  }
}
