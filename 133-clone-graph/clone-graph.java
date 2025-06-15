/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public static Node call(Node node,HashMap<Integer,Node>mp){
        Node nums=new Node(node.val);
        nums.neighbors=new ArrayList<>();
        mp.put(node.val,nums);

        List <Node> curr=node.neighbors;

        for(Node i : curr){
            if(!mp.containsKey(i.val)){
                nums.neighbors.add(call(i,mp));
            
            }else{
               nums.neighbors.add(mp.get(i.val));
            }
        }
        return nums;
    }
    public Node cloneGraph(Node node) {
        if(node==null){return null;}
        return call(node,new HashMap<>());
    }
}