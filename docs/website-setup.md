# Java 学习中心发布说明

网站入口文件：仓库根目录 `index.html`。

## GitHub Pages 发布

1. 进入仓库 Settings → Pages。
2. 在 Build and deployment 中选择 Deploy from a branch。
3. Branch 选 `main`，目录选 `/(root)`，保存。
4. 等待 GitHub 显示已发布的网址后，从该网址访问。

仓库当前为 Private。账户套餐和组织策略可能限制私有仓库 Pages 发布；**不要为了启用 Pages 就直接公开整个包含笔记和代码的仓库**。GitHub Pages 的发布站点可能面向公众，请避免放入内部业务数据、凭据和公司代码。

## 使用方式

- 网站提供 Day 1–5 的课程内容、代码练习、三题测验和本地打卡。
- 课程以页面中的标签切换，无须翻聊天记录。
- 学习记录保存在浏览器 localStorage；可在“学习记录”页导出 JSON。
- GitHub 中的课程文件不会随着网页打卡自动修改。
- Day 6 及以后尚未发布到网页，需要后续追加课程；每日 ChatGPT 提醒也不会自动更新此站点。

## 本地预览

下载仓库后可直接用浏览器打开根目录的 index.html。
