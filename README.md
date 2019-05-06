# 创建文件
    echo“＃blog”>> README.md 

# 本地文件夹下创建仓库
    git init

# 把创建的文件添加到本地仓库 
    it add README.md 
# 提交创建的文件
    git commit -m “first commit” 

# 连接github仓库，只需要连接一次
    git remote add origin git@github.com:zt11010/blog.git

# 推送到github上
    git push -u origin master
