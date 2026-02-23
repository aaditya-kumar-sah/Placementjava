#  1. To replace Null values to " " for data cleaning ->
data['label'] = data['label'].fillna('');

# 2. replace words to 0 and 1 ->
data.loc[data['category'] == 'spam', 'category'] = 1;
data.loc[data['category'] == 'ham', 'category'] = 0;

# 3. mode ko train karne se paihele data ko seprate karna parta hai trainning data katna dena hia aur test mai katna dena hai soo:
# paihele data ko divide karo like X and y: