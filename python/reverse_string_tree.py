
a = "abcdefghijklmn"


class Node():
    
    def __init__(self, x):
        self.value = x
        self.child = None

class TreeObject():

    def __init__(self):
        self.root = None

    def insert(self, node):
        node = Node(node)
        if self.root is None:
            self.root = node
        else:
            self.insert_node(self.root, node)

    def insert_node(self, node, new_node):
        if node.child is None:
            node.child = new_node
        else:
            self.insert_node(node.child, new_node)

    def traverse_tree(self, callback):
        self.in_order_traverse_node(self.root, callback)

    def in_order_traverse_node(self, node, callback):
        if node.child:
            self.in_order_traverse_node(node.child, callback)
            callback(node.value)
        else:
            callback(node.value)

l = []

def callback(x):
    l.append(x)

tree = TreeObject()
for i in a:
    tree.insert(i)

tree.traverse_tree(callback)
print("".join(i for i in l))
