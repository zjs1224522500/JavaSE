/**
 * <p>Project: 网络管理委员会招新网站, NetUnion Recruit WebSite </p>
 * <p>File: NutritionFacts.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * @author 张健顺
 * @email: 1224522500@qq.com
 * @date 2017年5月17日
 */
package com.java.effective;

/**
 * 构建器模式创建对象
 */
public class NutritionFacts {

	private final int servingSize;

	private final int servings;

	private final int calories;

	private final int fat;

	private final int sodium;

	private final int carbohydrate;

	public static class Builder {

		private final int servingSize;

		private final int servings;

		private int calories = 0;

		private int fat = 0;

		private int carbohydrate = 0;

		private int sodium;

		public Builder(int servingSize, int servings) {
			this.servings = servings;
			this.servingSize = servingSize;
		}

		public Builder calories(int val) {
			calories = val;
			return this;
		}

		public Builder fat(int val) {
			fat = val;
			return this;
		}

		public Builder carbohydraate(int val) {
			carbohydrate = val;
			return this;
		}

		public Builder sodium(int val) {
			sodium = val;
			return this;
		}

		public NutritionFacts build() {
			return new NutritionFacts(this);
		}

	}

	private NutritionFacts(Builder builder) {
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		carbohydrate = builder.carbohydrate;
		sodium = builder.sodium;
	}

	public static void main(String[] args) {
		NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).calories(100).sodium(35)
				.carbohydraate(27).build();
	}

}
