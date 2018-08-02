package in.co.capgemini;

public class Parked_CarOwner_Details {
	private String ownerName,carModel,carNo, ownerAddress;
	private int  OwnerMobileNo;
	
	
	public Parked_CarOwner_Details(String ownerName, String carModel, String ownerAddress, String carNo,
			int ownerMobileNo) {
		super();
		this.ownerName = ownerName;
		this.carModel = carModel;
		this.ownerAddress = ownerAddress;
		this.carNo = carNo;
		this.OwnerMobileNo = ownerMobileNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getOwnerAddress() {
		return ownerAddress;
	}
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public int getOwnerMobileNo() {
		return OwnerMobileNo;
	}
	public void setOwnerMobileNo(int ownerMobileNo) {
		OwnerMobileNo = ownerMobileNo;
	}
	
	
	@Override
	public String toString() {
		return "Parked_CarOwner_Details [OwnerName=" + getOwnerName() + ", CarModel=" + getCarModel()
				+ ", OwnerAddress=" + getOwnerAddress() + ", CarNo=" + getCarNo() + ", OwnerMobileNo="
				+ getOwnerMobileNo() + "]";
	}
	
	
}
