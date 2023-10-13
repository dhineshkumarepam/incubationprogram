package builderPattern;

public class Bicycle {
	
	    private final boolean hasGears;
	    private final boolean hasDoubleStand;
	    private final boolean hasDoubleSeat;
	    private final boolean hasCarrier;

	    private Bicycle(Builder builder) {
	        this.hasGears = builder.hasGears;
	        this.hasDoubleStand = builder.hasDoubleStand;
	        this.hasDoubleSeat = builder.hasDoubleSeat;
	        this.hasCarrier = builder.hasCarrier;
	    }

	    public boolean hasGears() {
	        return hasGears;
	    }

	    public boolean hasDoubleStand() {
	        return hasDoubleStand;
	    }

	    public boolean hasDoubleSeat() {
	        return hasDoubleSeat;
	    }

	    public boolean hasCarrier() {
	        return hasCarrier;
	    }

	    public static class Builder {
	        private boolean hasGears = false;
	        private boolean hasDoubleStand = false;
	        private boolean hasDoubleSeat = false;
	        private boolean hasCarrier = false;

	        public Builder addGears() {
	            this.hasGears = true;
	            return this;
	        }

	        public Builder addDoubleStand() {
	            this.hasDoubleStand = true;
	            return this;
	        }

	        public Builder addDoubleSeat() {
	            this.hasDoubleSeat = true;
	            return this;
	        }

	        public Builder addCarrier() {
	            this.hasCarrier = true;
	            return this;
	        }

	        public Bicycle build() {
	            return new Bicycle(this);
	        }
	    }
	}

	



	

	


