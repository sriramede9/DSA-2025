import arrays.TwoSum;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    TwoSum t = new TwoSum();
    Arrays.stream(t.twoSum(new int[]{2, 7, 11, 15}, 9)).forEach(System.out::println);
    Arrays.stream(t.twoSum(new int[]{1, 7, 4, 6, 3}, 9)).forEach(System.out::println);

}
