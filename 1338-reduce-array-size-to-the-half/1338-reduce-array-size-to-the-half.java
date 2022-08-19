class Solution {
    public int minSetSize(int[] arr) {
        int size = arr.length, requiredSize = size / 2, currentSize = 0, minimumSet = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : arr) map.put(ele, map.getOrDefault(ele, 0) + 1);

        List<Integer> al = new LinkedList<>(map.values());
        al.sort(Collections.reverseOrder());

        while (currentSize < requiredSize) {
            currentSize += al.remove(0);
            minimumSet++;
        }

        return minimumSet;
    }
}