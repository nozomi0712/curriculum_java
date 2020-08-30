package practice_abstract;

public abstract class JavaCurriculumTrainee {

	private String name;

	public JavaCurriculumTrainee(String name) {
		this.name = name;
	}

	public abstract void doJavaCurriculum();

	protected String getName() {
		return name;
	}
}
