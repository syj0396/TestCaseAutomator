import javalang

java_code = """
@Service
@RequiredArgsConstructor
@Slf4j
public class PlaceService {
    private static final String CATEGORY = "place";
    private final PlaceRepo placeRepo;
    private final ImageRepo imageRepo;
    private final S3Service s3Service;

    @Transactional
    public List<PlaceDto.Response> getAll() {
        return placeRepo.findAll()
                .stream()
                .map(place -> new PlaceDto.Response(
                        place,
                        imageRepo.findByPlace(place)))
                .collect(Collectors.toList());
    }
}
"""

tree = javalang.parse.parse(java_code)

# 의존성 주입된 필드 이름 추출
dependency_fields = []

for path, node in tree:
    if isinstance(node, javalang.tree.FieldDeclaration):
        for declarator in node.declarators:
            if node.modifiers and 'final' in node.modifiers:
                dependency_fields.append(declarator.name)

# 서비스 클래스 내에서 의존성 주입된 필드들이 사용되는 부분 추출
def extract_dependency_usages(tree, dependency_fields):
    usages = {}

    for path, node in tree:
        if isinstance(node, javalang.tree.MethodInvocation):
            if node.qualifier and node.qualifier in dependency_fields:
                if node.qualifier not in usages:
                    usages[node.qualifier] = []
                usages[node.qualifier].append(node.member)

    return usages


