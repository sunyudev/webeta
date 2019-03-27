package com.zhiyou100.pojo;

import java.util.Date;

public class RegistrationInfor {
    private String medicalRecord;

    private String name;

    private String certificateType;
    
    private CertificateType certificateTypes;

    private String idNum;

    private String socialSafeNum;

    private String phone;

    private Integer selfPaying;

    private Integer sex;

    private String career;

    private String earlyAppointment;

    /*private Integer doctorIds;*/

    private String status;

    private String noted;
    
    private Date time;
    
    private Doctor doctor;
    
    private SeccoXuan seccoXuan;
    
    private Integer age;
    
    private Double registrationFee;

    public String getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(String medicalRecord) {
        this.medicalRecord = medicalRecord == null ? null : medicalRecord.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType == null ? null : certificateType.trim();
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum == null ? null : idNum.trim();
    }

    public String getSocialSafeNum() {
        return socialSafeNum;
    }

    public void setSocialSafeNum(String socialSafeNum) {
        this.socialSafeNum = socialSafeNum == null ? null : socialSafeNum.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getSelfPaying() {
        return selfPaying;
    }

    public void setSelfPaying(Integer selfPaying) {
        this.selfPaying = selfPaying;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career == null ? null : career.trim();
    }

    public String getEarlyAppointment() {
        return earlyAppointment;
    }

    public void setEarlyAppointment(String earlyAppointment) {
        this.earlyAppointment = earlyAppointment == null ? null : earlyAppointment.trim();
    }

    /*public Integer getDactorId() {
        return doctorIds;
    }

    public void setDactorId(Integer dactorId) {
        this.doctorIds = dactorId;
    }*/

    public String getNoted() {
        return noted;
    }

    public void setNoted(String noted) {
        this.noted = noted == null ? null : noted.trim();
    }

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public SeccoXuan getSeccoXuan() {
		return seccoXuan;
	}

	public void setSeccoXuan(SeccoXuan seccoXuan) {
		this.seccoXuan = seccoXuan;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getRegistrationFee() {
		return registrationFee;
	}

	public void setRegistrationFee(Double registrationFee) {
		this.registrationFee = registrationFee;
	}

	public CertificateType getCertificateTypes() {
		return certificateTypes;
	}

	public void setCertificateTypes(CertificateType certificateTypes) {
		this.certificateTypes = certificateTypes;
	}

	
    
    
}