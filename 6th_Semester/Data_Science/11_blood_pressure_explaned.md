# Below is the explanation of the [code](./11_blood_pressure.r) to the 11th question

## Question:

Following table gives a frequency distribution of systolic blood pressure. Compute all the measures of dispersion

|              |       |        |        |        |        |        |        |        |        |
| :----------: | :---: | :----: | :----: | :----: | :----: | :----: | :----: | :----: | :----: |
| **Midpoint** | 95\.5 | 105\.5 | 115\.5 | 125\.5 | 135\.5 | 145\.5 | 155\.5 | 165\.5 | 175\.5 |
|  **Number**  |   5   |   8    |   22   |   27   |   17   |   9    |   5    |   5    |   2    |

## Explanation:

The task was to calculate various statistical measures (mean, variance, standard deviation, range, and interquartile range) for a given frequency distribution of systolic blood pressure readings. The data was provided in a grouped format, meaning we had ranges of blood pressure values (classes) and how many readings fell into each range (frequencies), rather than individual readings.

Here's a step-by-step explanation of what was done:

### 1. **Mean Calculation**

- **What?** The mean is the average value. In this case, it's the average systolic blood pressure reading.
- **How?** We multiplied each class midpoint (the middle value of each blood pressure range) by its frequency (how many readings are in that range), summed all those products up, and then divided by the total number of readings. This gives a weighted average, considering some ranges have more readings than others.

### 2. **Variance Calculation**

- **What?** Variance measures how spread out the blood pressure readings are from the mean. A higher variance means the readings are more spread out.
- **How?** We calculated the difference between each class midpoint and the mean, squared these differences (to make sure they are positive), and then weighted them by their frequencies. This sum was then divided by the total number of readings to get the average squared deviation from the mean.

### 3. **Standard Deviation Calculation**

- **What?** Standard deviation is the square root of the variance. It's in the same units as the original data, making it easier to understand.
- **How?** We simply took the square root of the variance. This tells us, on average, how much individual blood pressure readings deviate from the mean blood pressure.

### 4. **Range Calculation**

- **What?** The range is the difference between the highest and lowest values in the data.
- **How?** We subtracted the smallest midpoint from the largest midpoint. This gives a rough idea of the spread of the entire dataset.

### 5. **Interquartile Range (IQR) Calculation**

- **What?** The IQR measures the middle 50% of the data, which is the range between the first quartile (25th percentile) and the third quartile (75th percentile). It helps understand the spread of the middle half of the data.
- **How?** This was a bit complex due to the grouped data. We first found positions in the data that correspond to the first and third quartiles based on the cumulative frequencies. Then, we approximated the quartile values by considering where these positions fall within the class intervals. This involved some proportional calculations to estimate the exact values of the quartiles.

The reason for all these calculations is to understand the distribution of systolic blood pressure readings in the dataset. Each measure gives us different insights, like the average pressure (mean), how spread out the readings are (variance and standard deviation), and the spread of the middle 50% of the data (IQR).
