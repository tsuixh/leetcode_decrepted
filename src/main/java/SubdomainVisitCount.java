import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A website domain like "discuss.leetcode.com" consists of various subdomains. At the top level, we have "com", at the next level, we have "leetcode.com", and at the lowest level, "discuss.leetcode.com". When we visit a domain like "discuss.leetcode.com", we will also visit the parent domains "leetcode.com" and "com" implicitly.
 * <p>
 * Now, call a "count-paired domain" to be a count (representing the number of visits this domain received), followed by a space, followed by the address. An example of a count-paired domain might be "9001 discuss.leetcode.com".
 * <p>
 * We are given a list cpdomains of count-paired domains. We would like a list of count-paired domains, (in the same format as the input, and in any order), that explicitly counts the number of visits to each subdomain.
 * <p>
 * 一个网站域名，如"discuss.leetcode.com"，包含了多个子域名。作为顶级域名，常用的有"com"，下一级则有"leetcode.com"，最低的一级为"discuss.leetcode.com"。当我们访问域名"discuss.leetcode.com"时，也同时访问了其父域名"leetcode.com"以及顶级域名 "com"。
 * <p>
 * 给定一个带访问次数和域名的组合，要求分别计算每个域名被访问的次数。其格式为访问次数+空格+地址，例如："9001 discuss.leetcode.com"。
 * <p>
 * 接下来会给出一组访问次数和域名组合的列表cpdomains 。要求解析出所有域名的访问次数，输出格式和输入格式相同，不限定先后顺序。
 *
 * @author tsuixh
 */
public class SubdomainVisitCount {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> vistorCounter = new HashMap<>();
        for (String data : cpdomains) {
            String[] timesAndDomain = data.split(" ");
            Integer count = Integer.parseInt(timesAndDomain[0]);
            String domain = timesAndDomain[1];
            while (true) {
                if (vistorCounter.containsKey(domain)) {
                    Integer addNumber = vistorCounter.get(domain);
                    vistorCounter.put(domain, addNumber + count);
                } else {
                    vistorCounter.put(domain, count);
                }
                int firstDotIndex = domain.indexOf(".");
                if (firstDotIndex != -1) {
                    domain = domain.substring(firstDotIndex + 1);
                } else {
                    break;
                }
            }
        }

        List<String> result = new ArrayList<>();
        for (Map.Entry data : vistorCounter.entrySet()) {
            result.add(data.getValue() + " " + data.getKey());
        }
        return result;
    }
}
