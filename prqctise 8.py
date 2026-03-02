# Practice 8: Data Cleaning using Pandas

import pandas as pd
import numpy as np


data = {
    "Time": ["06:00", "09:00", "12:00", "15:00", "18:00", "21:00", "12:00", "03:00"],
    "Temperature (°C)": [22, 25, np.nan, 200, 30, -150, np.nan, 24],
    "Humidity (%)": [60, np.nan, 55, 50, 65, 70, 55, np.nan]
}

df = pd.DataFrame(data)

print("🔹 Original Dataset:\n")
print(df)


print("\n🔹 Missing Values in Each Column:\n")
print(df.isnull().sum())


df.loc[(df["Temperature (°C)"] < -10) | 
       (df["Temperature (°C)"] > 50), 
       "Temperature (°C)"] = np.nan



df["Temperature (°C)"] = df["Temperature (°C)"].fillna(df["Temperature (°C)"].mean())
df["Humidity (%)"] = df["Humidity (%)"].fillna(df["Humidity (%)"].mean())


df = df.drop_duplicates()

print("\n🔹 Cleaned Dataset:\n")
print(df)