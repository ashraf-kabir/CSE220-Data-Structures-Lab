package task01;

public class MyOrderList {

	public Node cursor;

	public MyOrderList() {
		cursor = new Node(null, null);
		cursor.next = cursor;
	}

	public void insert(Node newElement) {
		boolean valid = true;

		if (cursor.key == null) {
			cursor = newElement;
			cursor.next = cursor;
			valid = false;
		}

		else {
			for (Node n = cursor;; n = n.next) {
				if ((int) n.key == (int) newElement.key) {
					valid = false;
					System.out.println("The key already exists. Do not insert the key");
					break;
				}
				if ((int) n.next.key == (int) cursor.key) {
					break;
				}
			}
		}

		if (valid) {
			Node start = null;

			for (Node n = cursor; ; n = n.next) {
				if ((int) n.key >= (int) n.next.key) {
					start = n.next;
					break;
				}
			}

			if ((int) start.key > (int) newElement.key) {
				newElement.next = start;

				for (Node n = start.next; ; n = n.next) {
					if ((int) n.next.key <= (int) start.key) {
						n.next = newElement;
						break;
					}

					if ((int) n.next.key <= (int) n.key) {
						break;
					}
				}
			} else {
				for (Node n = cursor; ; n = n.next) {
					if ((int) n.key < (int) newElement.key && (int) n.next.key > (int) newElement.key) {
						newElement.next = n.next;
						n.next = newElement;
						break;
					} else if ((int) n.key < (int) newElement.key && (int) n.next.key <= (int) n.key) {
						newElement.next = n.next;
						n.next = newElement;
						break;
					}
				}
			}
		}
	}

	public void showList() {
		if (cursor.key == null) {
			System.out.println("Empty list");
		} else {
			Node start = null;
			for (Node n = cursor; ; n = n.next) {
				if ((int) n.key >= (int) n.next.key) {
					start = n.next;
					break;
				}
			}

			for (Node n = start;; n = n.next) {
				System.out.print(n.key);

				if ((int) n.next.key <= (int) n.key) {
					System.out.println(".");
					break;
				} else {
					System.out.print(",");
				}
			}
		}
	}

	public Node retrieve(int searchKey) {
		if (cursor.key == null) {
			return null;
		}

		for (Node n = cursor;; n = n.next) {
			if ((int) n.key == searchKey) {
				cursor = n;
				return n;
			}

			if ((int) n.next.key <= (int) n.key) {
				return null;
			}
		}
	}

	public Node remove() {
		if (cursor.next.key != cursor.key) {
			Node temp = cursor;
			cursor = cursor.next;

			for (Node n = temp; ; n = n.next) {
				if (n.next.key == temp.key) {
					n.next = cursor;
					break;
				}
			}
			return temp;
		} else {
			Node temp = cursor;
			cursor = new Node(null, null);
			cursor.next = cursor;
			return temp;
		}
	}

	public Node remove(int deleteKey) {
		if ((int) cursor.next.key == (int) cursor.key && (int) cursor.key == deleteKey) {
			Node temp = cursor;
			cursor = new Node(null, null);
			cursor.next = cursor;
			return temp;
		} else if ((int) cursor.key != deleteKey) {
			for (Node n = cursor.next; ; n = n.next) {
				if ((int) n.key == deleteKey) {
					Node temp = n;
					cursor = n.next;

					for (Node n0 = n;; n0 = n0.next) {
						if ((int) n0.next.key == (int) n.key) {
							n0.next = cursor;
							break;
						}
					}
					return temp;
				}

				if ((int) n.next.key <= (int) n.key) {
					break;
				}
			}
		} else {
			Node temp = cursor;
			cursor = temp.next;
			for (Node n = cursor; ; n = n.next) {
				if ((int) n.next.key == (int) temp.key) {
					n.next = cursor;
					break;
				}
			}
			return temp;
		}
		return null;
	}

	public void clear() {
		if (cursor.key != null) {
			cursor = new Node(null, null);
			cursor.next = cursor;
		}
	}

	public boolean isEmpty() {
		if (cursor.key != null) {
			return false;
		}
		return true;
	}

	public Node gotoBeginning() {
		if (cursor.key == null) {
			return null;
		}
		Node start = null;
		for (Node n = cursor; ; n = n.next) {
			if ((int) n.key >= (int) n.next.key) {
				start = n.next;
				break;
			}
		}
		cursor = start;
		return cursor;
	}

	public Node gotoEnd() {
		if (cursor.key == null) {
			return null;
		}
		Node end = null;
		for (Node n = cursor; ; n = n.next) {
			if ((int) n.key >= (int) n.next.key) {
				end = n;
				break;
			}
		}
		cursor = end;
		return cursor;
	}

	public Node gotoNext() {
		if (cursor.key == null) {
			return null;
		}
		cursor = cursor.next;
		return cursor;
	}

	public Node gotoPrior() {
		if (cursor.key == null) {
			return null;
		}
		for (Node n = cursor; ; n = n.next) {
			if ((int) n.next.key == (int) cursor.key) {
				cursor = n;
				break;
			}
		}
		return cursor;
	}

	public Node getCursor() {
		if (cursor.key == null) {
			return null;
		}
		return cursor;
	}

}
