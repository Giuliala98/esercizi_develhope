public class Student implements Comparable<Student> {
    private String nome;
    private int age;
    public Student(String nome, int age) {
        this.nome = nome;
        this.age = age;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student{" +
                "nome='" + nome + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        if(student!= null) {
            return getNome().compareTo(student.getNome());
        }
        return 0;
    }
}
