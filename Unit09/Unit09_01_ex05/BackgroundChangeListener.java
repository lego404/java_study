package Unit09_01_ex05;

public class BackgroundChangeListener implements CheckBox.OnSelectListener{
	@Override
	public void onSelect() {
		System.out.println("배경을 변경합니다.");
	}
}
