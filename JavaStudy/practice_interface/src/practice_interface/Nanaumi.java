package practice_interface;

public class Nanaumi implements OrderFromMotoki{

	private String name;
	private String date;

	public Nanaumi (String n, String yyyyMM) {
		name = n;
		date = yyyyMM;
	}

	private void submitOrder (final int shoriFlg) {
		String nameAnd = name + "、";

		if(shoriFlg == 0) {
			System.out.println(nameAnd + date + "の勤務表出しました");
		} else if (shoriFlg == 1) {
			System.out.println(nameAnd + date + "の交通費も出しました");
		} else {
			System.out.println(nameAnd + "まだ何もしてません");
		}
	}

	public void doNothing() {
		submitOrder(-1);
	}

	@Override
	public void daseyaKinmuhyo() {
		submitOrder(0);
	}

	@Override
	public void daseyaKotsuhi() {
		submitOrder(1);
	}

	@Override
	public void goToSevenEleven() {
		System.out.println("先にセブンイレブンいってきやす");
	}
}
