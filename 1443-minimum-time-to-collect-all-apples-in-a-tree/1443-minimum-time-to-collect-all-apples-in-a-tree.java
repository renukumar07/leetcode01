class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        // all the nodes from the apple to root
        Set<Integer> ans = new HashSet<>();
        // the nodes whose parents are not processed
        Queue<Integer> queue = new LinkedList<>();
        // processed nodes
        Set<Integer> exists = new HashSet<>();
        // add the root node
        exists.add(0);
        // mark all apples
        for (int i = 0; i < hasApple.size(); i++) {
            if (hasApple.get(i)) {
                ans.add(i);
                queue.add(i);
            }
        }
        // no apple
        if (ans.isEmpty()) {
            return 0;
        }
        // (k, v) -> (child, parent)
        Map<Integer, Integer> father = new HashMap<>();
        for (int[] edge : edges) {
            // up: parent, down: child
            int up = edge[0];
            int down = edge[1];
            // if the down already exists, mark it up
            if (exists.contains(edge[1]) && !exists.contains(edge[0])) {
                up = edge[1];
                down = edge[0];
            }
            if (ans.contains(down)) {
                ans.add(up);
                queue.add(up);
            } else {
                // not yet connected to apple route
                father.put(down, up);
            }
            exists.add(down);
            exists.add(up);
        }
        // process the father nodes, util meet a processed father
        while (!queue.isEmpty()) {
            Integer next = queue.poll();
            while (father.containsKey(next)) {
                next = father.remove(next);
                if (!ans.contains(next)) {
                    ans.add(next);
                    queue.add(next);
                }
            }
        }
        // remove the count of root node
        return (ans.size() - 1) * 2;
    }
}
