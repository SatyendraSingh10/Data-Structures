package in.ss.data.structures.trees.binary;

import lombok.Data;
import lombok.NonNull;

@Data
class Node {
    @NonNull int data;
    Node left, right;
}
