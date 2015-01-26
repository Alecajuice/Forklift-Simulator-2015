package graphics;

public class Transformations {

	public static Vector xYRot(Vector vec, double radians) {
		double[] matrix = {
				Math.cos(radians), -Math.sin(radians), 0,
				Math.sin(radians), Math.cos(radians), 0,
				0, 0, 1
		};
		
		double newX = vec.getX()*matrix[0] + vec.getY()*matrix[1] + vec.getZ()*matrix[2];
		double newY = vec.getX()*matrix[3] + vec.getY()*matrix[4] + vec.getZ()*matrix[5];
		double newZ = vec.getX()*matrix[6] + vec.getY()*matrix[7] + vec.getZ()*matrix[8];
		
		return new Vector((int)newX, (int)newY, (int)newZ);
	}
	
	public static Vector xZRot(Vector vec, double radians) {
		double[] matrix = {
				Math.cos(radians), 0, Math.sin(radians),
				0, 1, 0,
				-Math.sin(radians), 0, Math.cos(radians)
		};
		
		double newX = vec.getX()*matrix[0] + vec.getY()*matrix[1] + vec.getZ()*matrix[2];
		double newY = vec.getX()*matrix[3] + vec.getY()*matrix[4] + vec.getZ()*matrix[5];
		double newZ = vec.getX()*matrix[6] + vec.getY()*matrix[7] + vec.getZ()*matrix[8];
		
		return new Vector((int)newX, (int)newY, (int)newZ);
	}
	
	public static Vector yZRot(Vector vec, double radians) {
		double[] matrix = {
				Math.cos(radians), -Math.sin(radians), 0,
				Math.sin(radians), Math.cos(radians), 0,
				0, 0, 1
		};
		
		double newX = vec.getX()*matrix[0] + vec.getY()*matrix[1] + vec.getZ()*matrix[2];
		double newY = vec.getX()*matrix[3] + vec.getY()*matrix[4] + vec.getZ()*matrix[5];
		double newZ = vec.getX()*matrix[6] + vec.getY()*matrix[7] + vec.getZ()*matrix[8];
		
		return new Vector((int)newX, (int)newY, (int)newZ);
	}
}
