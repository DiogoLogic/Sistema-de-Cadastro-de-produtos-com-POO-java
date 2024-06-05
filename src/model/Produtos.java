package model;

public class Produtos {
		private String material;
	    private String type;
	    private String brand;
	    private String color;
	    private int qnt; //qnt = Quantidade
	    private String comment;
	    
	    
	    
	    public Produtos(String material, String type, String brand, String color, int qnt, String comment) {
	        this.material = material;
	        this.type = type;
	        this.brand = brand;
	        this.color = color;
	        this.qnt = qnt;
	        this.comment = comment;
	        
	    }



		public String getMaterial() {
			return material;
		}



		public void setMaterial(String material) {
			this.material = material;
		}



		public String getType() {
			return type;
		}



		public void setType(String type) {
			this.type = type;
		}



		public String getBrand() {
			return brand;
		}



		public void setBrand(String brand) {
			this.brand = brand;
		}



		public String getColor() {
			return color;
		}



		public void setColor(String color) {
			this.color = color;
		}



		public int getQnt() {
			return qnt;
		}



		public void setQnt(int qnt) {
			this.qnt = qnt;
		}



		public String getComment() {
			return comment;
		}



		public void setComment(String comment) {
			this.comment = comment;
		}



		@Override
		public String toString() {
			return "[Produtos --> material: " + material + ", type: " + type + ", brand: " + brand + ", color: " + color
					+ ", qnt: " + qnt + ", comment: " + comment + "]";
		}

		
		
		
}