public int tarsum(Node root, int target){
    if(root == null) return 0;
    if(root.val == target) return root.val;
    return tarsum(root.left, target - root.val);
    return tarsum(root.right, target - root.val);
}