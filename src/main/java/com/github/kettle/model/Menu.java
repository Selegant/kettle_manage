package com.github.kettle.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @Author WangTao
 * @CreateTime 2019-09-09 22:00
 */
@Accessors(chain = true)
@Data
public class Menu {



    /**
     * icon : md-funnel
     * name : level_2_1
     * meta : {"icon":"md-funnel","title":"二级-1"}
     * children : [{"icon":"md-funnel","name":"level_2_2_1","meta":{"icon":"md-funnel","title":"三级"}},{"icon":"md-funnel","name":"level_2_2_2","meta":{"icon":"md-funnel","title":"三级"}}]
     */
    private String icon;
    private String name;
    private String path;
    private MetaBean meta;
    private List<ChildrenBean> children;

    @Data
    public static class MetaBean {
        /**
         * icon : md-funnel
         * title : 二级-1
         */
        private String icon;
        private String title;
    }

    @Data
    public static class ChildrenBean {
        /**
         * icon : md-funnel
         * name : level_2_2_1
         * meta : {"icon":"md-funnel","title":"三级"}
         */
        private String icon;
        private String name;
        private String path;
        private MetaBeanX meta;

        @Data
        public static class MetaBeanX {
            /**
             * icon : md-funnel
             * title : 三级
             */
            private String icon;
            private String title;
        }
    }


//    /**
//     * icon : md-arrow-dropdown-circle
//     * name : tree_select_page
//     * meta : {"icon":"md-arrow-dropdown-circle","title":"树状下拉选择器"}
//     */
//
//    private String icon;
//    private String name;
//    private MetaBean meta;
//
//    @Data
//    public static class MetaBean {
//        /**
//         * icon : md-arrow-dropdown-circle
//         * title : 树状下拉选择器
//         */
//
//        private String icon;
//        private String title;
//    }
}
