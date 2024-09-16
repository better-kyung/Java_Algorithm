import java.util.*;
class Solution {
    
    Map<Integer, List<Integer>> graph = new HashMap<>();
    int answer = 1;
    
    static class Node {
        int index;
        int sheep;
        int wolves;
        List<Integer> nodes;
        
        Node(int index, int sheep, int wolves, List<Integer> nodes) {
            this.index = index;
            this.sheep = sheep;
            this.wolves = wolves;
            this.nodes = nodes;
        }
    }
    
    
    public int solution(int[] info, int[][] edges) {
        
        for (int[] edge : edges) {
            graph.putIfAbsent(edge[0], new ArrayList<>());
            graph.get(edge[0]).add(edge[1]);
        }
        
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(0, 1, 0, graph.get(0)));
        
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            
            for (int nextNode : node.nodes) {
                int nextSheep = (info[nextNode] == 0) ? node.sheep + 1 : node.sheep;
                int nextWolves = (info[nextNode] == 1) ? node.wolves + 1 : node.wolves;
                
                if (nextSheep > nextWolves) {
                    answer = Math.max(answer, nextSheep);
                    
                    List<Integer> candidateNodes = new ArrayList<>(node.nodes);
                    candidateNodes.remove((Integer) nextNode);
                    if (graph.get(nextNode) != null) {
                        candidateNodes.addAll(graph.get(nextNode));
                    }
                    
                    queue.offer(new Node(nextNode, nextSheep, nextWolves, candidateNodes));
                }
            }
        }
        return answer;
    }
}