package com.repex.SpringSamples;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "marks")
public class Marks {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "roll_no")
	private int rollno;
	// @Column(name = "student_Id")
	// private int studentId;
	@Column(name = "physics")
	private int physics;
	@Column(name = "chemistry")
	private int chemistry;
	@Column(name = "cosmology")
	private int cosmology;

	public Marks() {
	}

	public Marks(int rollno, int studentId, int physics, int chemistry, int cosmology, Students students) {
		this.rollno = rollno;
		// this.studentId = studentId;
		this.chemistry = chemistry;
		this.physics = physics;
		this.cosmology = cosmology;
	}

	// public Marks marks;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	// @ManyToOne
	// @JoinColumn(name = "student_Id", unique = true, nullable = false)
	// private Students students;
	//
	// public int getStudentId() {
	// return studentId;
	// }
	//
	// public void setStudentId(int studentId) {
	// this.studentId = studentId;
	// }

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getCosmology() {
		return cosmology;
	}

	public void setCosmology(int cosmology) {
		this.cosmology = cosmology;
	}

	// public Students getStudents() {
	// return students;
	// }
	//
	// public void setStudents(Students students) {
	// this.students = students;
	// }

}
