package second.ex2;

import java.util.*;

public class BreadStore {
	private List<Bread> breads;

	public BreadStore() {
		breads = new LinkedList<>();
	}

	/**
	 * Giả sử bánh mỳ được làm không cho một loại gia vị nhiều hơn một lần.
	 * Bắt đầu, tạo ra và cho vào cửa hàng:
	 *  5 bánh mỳ ThickcrustBread chỉ có cheese,
	 *  5 bánh mỳ ThickcrustBread chỉ có olives,
	 *  5 bánh mỳ ThickcrustBread có cả cheese và olives,
	 *  5 bánh mỳ ThincrustBread chỉ có cheese,
	 *  5 bánh mỳ ThincrustBread chỉ có olives,
	 *  5 bánh mỳ ThincrustBread có cả cheese và olives.
	 */
	public void init() {
		 /* TODO */
		for (int i = 0; i < 5; i++) {
			breads.add(new Cheese(new ThickcrustBread()));
			breads.add(new Olives(new ThickcrustBread()));
			breads.add(new Olives(new Cheese(new ThickcrustBread())));
			breads.add(new Cheese(new ThincrustBread()));
			breads.add(new Olives(new ThincrustBread()));
			breads.add(new Olives(new Cheese(new ThincrustBread())));
		}
	}

	/**
	 * Thêm bánh mỳ vào cửa hàng.
	 */
	public void add(Bread bread) {
		/* TODO */
		breads.add(bread);
	}

	/**
	 * Giả sử cửa hàng bán một cái bánh mỳ nào đó,
	 * Bánh mỳ được lấy ra để bán là bánh mỳ đầu tiên có giá bằng giá
	 *  bánh mỳ yêu cầu.
	 * Nếu còn bánh mỳ để bán thì trả về giá trị true,
	 *  nếu không còn trả về giá trị false.
	 */
	public boolean sell(Bread bread) {
		/* TODO */
		for (Bread b : breads) {
			if(b.equals(bread)){
				breads.remove(b);
				return true;
			}
		}
		return false;
	}

	/**
	 * In ra những bánh mỳ còn trong cửa hàng.
	 */
	public void print() {
		/* TODO */
		for (Bread b : breads){
			System.out.println(b.getDescription());
		}
		System.out.println();
	}

	/**
	 * Sắp xếp các bánh mỳ còn lại theo thứ tự được cho bởi order,
	 * nếu order là true, sắp xếp theo thứ tự tăng dần,
	 * nếu order là false, sắp xếp theo thứ tự giảm dần.
	 * Việc sắp xếp không làm thay đổi thứ tự của bánh mỳ trong cửa hàng.
	 */
	public List<Bread> sort(boolean order) {
		/* TODO */
		List<Bread> newBread = new ArrayList<>(breads);
		Collections.sort(newBread, new Comparator<Bread>() {
			@Override
			public int compare(Bread o1, Bread o2) {
				return Double.compare(o1.cost(), o2.cost());
			}
		});
		return newBread;
	}

	/**
	 * Lọc ra howMany cái bánh mỳ có giá cao nhất hoặc thấp nhất,
	 * nếu order là true thì lọc ra bánh mỳ có giá cao nhất,
	 * nếu order là false thì lọc ra bánh mỳ có giá thấp nhất.
	 */
	public List<Bread> filter(int howMany, boolean order) {
		/* TODO */
		List<Bread> newBread = sort(order);
		List<Bread> mt = new ArrayList<>();
		int count = 0;
		while (count < howMany){
			mt.add(count, newBread.get(count));
			count++;
		}
		return mt;
	}

	public static void main(String args[]) {
		BreadStore breadStore = new BreadStore();
		breadStore.init();

		/*
		* Sau khi khởi tạo số bánh mỳ cho cửa hàng, viết chương trình demo:
		* - Thêm một số bánh mỳ vào cửa hàng
		* - Bán một số bánh mỳ từ cửa hàng
		* - In ra số bánh mỳ còn lại theo thứ tự giá tăng dần.
		* - In ra nhiều nhất 10 cái bánh mỳ có giá thấp nhất còn trong cửa hàng.
		*/
		/* TODO */
		Bread b1 = new Cheese(new ThickcrustBread());
		Bread b2 = new Olives(new ThickcrustBread());
		Bread b3 = new Olives(new Cheese(new ThickcrustBread()));
		breadStore.print();
		breadStore.add(b1);
		breadStore.add(b2);
		breadStore.add(b3);
		breadStore.print();
		breadStore.sell(b1);
		breadStore.print();
		breadStore.filter(10,true);
	}
}
