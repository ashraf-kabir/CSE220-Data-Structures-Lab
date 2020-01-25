package Assignment03.Task01;

public class Tester {
	
	public static MyOrderList mol = new MyOrderList();
	
	public static void main(String[] args) {

		insertTester();
		retrieveTester();
		remove1Tester();
		remove2Tester();
		clearTester();
		isEmptyTester();
		gotoBeginningTester();
		gotoEndTester();
		gotoNextTester();
		gotoPriorTester();
		getCursorTester();
		showListTester();
	}
	
	public static void insertTester() {
		
		System.out.println("----------Test 01 : insert----------");
		mol.showList();
		mol.insert(new Node(0, null));
		mol.showList();
		mol.insert(new Node(50, null));
		mol.showList();
		mol.insert(new Node(40, null));
		mol.showList();
		mol.insert(new Node(60, null));
		mol.showList();
		mol.insert(new Node(30, null));
		mol.showList();
		mol.insert(new Node(70, null));
		mol.showList();
		mol.insert(new Node(70, null));
		mol.showList();

		System.out.println();
	}

	public static void retrieveTester() {
		System.out.println("----------Test 02 : retrieve----------");

		System.out.println(mol.retrieve(80));
		System.out.println(mol.retrieve(40).key);
		System.out.println(mol.retrieve(60).key);
		System.out.println(mol.retrieve(20));

		System.out.println();
	}

	public static void remove1Tester() {
		System.out.println("----------Test 03 : remove1----------");

		mol.showList();
		System.out.println("Deleted key - " + mol.remove().key);
		mol.showList();
		System.out.println("Deleted key - " + mol.remove().key);
		mol.showList();
		System.out.println("Deleted key - " + mol.remove().key);
		mol.showList();
		System.out.println("Deleted key - " + mol.remove().key);
		mol.showList();
		System.out.println("Deleted key - " + mol.remove().key);
		mol.showList();
		System.out.println("Deleted key - " + mol.remove().key);
		mol.showList();

		System.out.println();
	}

	public static void remove2Tester() {
		System.out.println("----------Test 04 : remove2----------");

		mol.insert(new Node(30, null));
		mol.insert(new Node(10, null));
		mol.insert(new Node(40, null));
		mol.insert(new Node(20, null));

		mol.showList();
		System.out.println("Deleted key - " + mol.remove(40).key);
		mol.showList();
		System.out.println("Deleted key - " + mol.remove(20).key);
		mol.showList();
		System.out.println("Deleted key - " + mol.remove(30).key);
		mol.showList();
		System.out.println("Deleted key - " + mol.remove(10).key);
		mol.showList();

		System.out.println();
	}

	public static void clearTester() {
		System.out.println("----------Test 05 : clear----------");

		mol.insert(new Node(30, null));
		mol.insert(new Node(10, null));
		mol.insert(new Node(40, null));
		mol.insert(new Node(20, null));

		mol.showList();
		mol.clear();
		mol.showList();

		System.out.println();
	}

	public static void isEmptyTester() {
		System.out.println("----------Test 06 : isEmpty----------");

		mol.insert(new Node(30, null));
		mol.insert(new Node(10, null));
		mol.insert(new Node(40, null));
		mol.insert(new Node(20, null));

		mol.showList();
		System.out.println("Empty List - " + mol.isEmpty());
		mol.clear();
		mol.showList();
		System.out.println("Empty List - " + mol.isEmpty());

		System.out.println();
	}

	public static void gotoBeginningTester() {
		System.out.println("----------Test 07 : gotoBeginning----------");

		mol.showList();
		System.out.println("Current Cursor key - " + mol.gotoBeginning());
		mol.insert(new Node(100, null));
		mol.showList();
		System.out.println("Current Cursor key - " + mol.gotoBeginning().key);
		mol.insert(new Node(50, null));
		mol.showList();
		System.out.println("Current Cursor key - " + mol.gotoBeginning().key);
		mol.insert(new Node(150, null));
		mol.showList();
		System.out.println("Current Cursor key - " + mol.gotoBeginning().key);
		mol.insert(new Node(0, null));
		mol.showList();
		System.out.println("Current Cursor key - " + mol.gotoBeginning().key);

		System.out.println();
	}

	public static void gotoEndTester() {
		System.out.println("----------Test 08 : gotoEnd----------");

		mol.showList();
		System.out.println("Current Cursor key - " + mol.gotoEnd().key);
		mol.remove(150);
		mol.showList();
		System.out.println("Current Cursor key - " + mol.gotoEnd().key);
		mol.remove(100);
		mol.showList();
		System.out.println("Current Cursor key - " + mol.gotoEnd().key);
		mol.remove(50);
		mol.showList();
		System.out.println("Current Cursor key - " + mol.gotoEnd().key);
		mol.remove(0);
		mol.showList();
		System.out.println("Current Cursor key - " + mol.gotoEnd());

		System.out.println();
	}

	public static void gotoNextTester() {
		System.out.println("----------Test 09 : gotoNext----------");

		mol.insert(new Node(333, null));
		mol.insert(new Node(111, null));
		mol.insert(new Node(444, null));
		mol.insert(new Node(222, null));

		mol.showList();
		System.out.println("Current Cursor key - " + mol.cursor.key);
		System.out.println("Current Cursor key - " + mol.gotoNext().key);
		System.out.println("Current Cursor key - " + mol.gotoNext().key);
		System.out.println("Current Cursor key - " + mol.gotoNext().key);
		System.out.println("Current Cursor key - " + mol.gotoNext().key);
		mol.clear();
		mol.showList();
		System.out.println("Current Cursor key - " + mol.gotoNext());

		System.out.println();
	}

	public static void gotoPriorTester() {
		System.out.println("----------Test 10 : gotoPrior----------");

		mol.insert(new Node(333, null));
		mol.insert(new Node(111, null));
		mol.insert(new Node(444, null));
		mol.insert(new Node(222, null));

		mol.showList();
		System.out.println("Current Cursor key - " + mol.cursor.key);
		System.out.println("Current Cursor key - " + mol.gotoPrior().key);
		System.out.println("Current Cursor key - " + mol.gotoPrior().key);
		System.out.println("Current Cursor key - " + mol.gotoPrior().key);
		System.out.println("Current Cursor key - " + mol.gotoPrior().key);
		mol.clear();
		mol.showList();
		System.out.println("Current Cursor key - " + mol.gotoPrior());
		
		System.out.println();
	}

	public static void getCursorTester() {
		System.out.println("----------Test 11 : getCursor----------");

		mol.insert(new Node(333, null));
		mol.insert(new Node(111, null));
		mol.insert(new Node(444, null));
		mol.insert(new Node(222, null));

		mol.showList();
		System.out.println(mol.getCursor().key);
		mol.gotoBeginning();
		System.out.println(mol.getCursor().key);
		mol.gotoEnd();
		System.out.println(mol.getCursor().key);
		mol.gotoNext();
		System.out.println(mol.getCursor().key);
		mol.gotoPrior();
		System.out.println(mol.getCursor().key);
		mol.clear();
		mol.showList();
		System.out.println(mol.getCursor());

		System.out.println();
	}

	public static void showListTester() {
		System.out.println("----------Test 12 : showList----------");

		mol.insert(new Node(333, null));
		mol.insert(new Node(111, null));
		mol.insert(new Node(444, null));
		mol.insert(new Node(222, null));

		mol.showList();
		mol.clear();
		mol.showList();
	}

}
